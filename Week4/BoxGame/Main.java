/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4.BoxGame;

/**
 *
 * @author ayza
 */
public class Main {

    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 50);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 50);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}
