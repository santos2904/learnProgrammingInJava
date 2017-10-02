/* Challenge Activity 3 - Role Playing Game
 * 

Use the Actor and Weapon classes in the roleplaying package to do the following

1) Make a weapon called sword which does up to 10 damage
2) Make a weapon called bite which does up to 5 damage
3) Make a knight "Sir Glagane" with 20 health, 5 armor, and the sword as a weapon
4) Make a snake called "Viper" with 10 health, 1 armor and the bite as a weapon
5) Print out the knight and snake.
6) Make the snake bite the knight, and apply damage to the knight
7) Make the knight slash the snake, and apply damamge to the snake.
8) print out the knight and the snake.

 */
package roleplayinggame;

import roleplaying.Actor;
import roleplaying.Weapon;

public class RolePlayingGame {

    public static void main(String[] args) {
        Weapon sword = new Weapon ("Sowrd","Slashs", 10); //Make a weapon called sword which does up to 10 damage
        Weapon bite = new Weapon ("Bite", "bite", 5); // Make a weapon called bite which does up to 5 damage
        Actor knight = new Actor ("Sir Glagane", 10, 5, sword); //Make a knight "Sir Glagane" with 20 health, 5 armor, and the sword as a weapon
        Actor snake = new Actor ("Viper", 10, 1, bite); //Make a snake called "Viper" with 10 health, 1 armor and the bite as a weapon
        System.out.println(knight); //Print out the knight and snake.
        System.out.println(snake);
        int damage = snake.weapon().hitDamage(); //Make the snake bite the knight, and apply damage to the knight
        knight.takeDamage(damage);
        System.out.printf("%s's %s does %d damage\n", snake.name(), snake.weapon().action(), damage);
        damage = knight.weapon().hitDamage(); // Make the knight slash the snake, and apply damamge to the snake.
        snake.takeDamage(damage);
        System.out.printf("%s's %s does %d damage\n", knight.name(), knight.weapon().action(), damage);
        System.out.println(knight); //print out the knight and the snake.
        System.out.println(snake);
    }
}
