package com.company;

import com.company.memento.Editor;
import com.company.memento.History;
import com.company.state.Canvas;
import com.company.state.SelectionTool;
import com.company.state.abuse.Stopwatch;

public class Main {

    public static void main(String[] args) {
        /*
        User user = new User("Zeyneb");
        user.sayHello();
         */
        /*
        //encapsulation
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
         */

        /*
        //abstraction
        var mailService = new MailService();
        mailService.

         */

        /*
        //inheritance
        var textBox = new TextBox();
        textBox.enable();

         */

        //polymorphism

        //drawUIConrol(new CheckBox());


        /*
        //memento pattern
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());
        editor.restore(history.pop());
        System.out.println(editor.getContent());


         */
        /*
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

         */
        var stopwatch = new Stopwatch();
        stopwatch.click();
        stopwatch.click();
        stopwatch.click();



    }

    /*
    polymorphism
    public  static void drawUIConrol(UIControl control) {
        control.draw();
    }

     */

}
