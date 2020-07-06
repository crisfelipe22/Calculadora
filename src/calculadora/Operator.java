/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;


import liststring.QueueString;
import listnumeric.PileNum;

/**
 *
 * @author jgale
 */
public class Operator {

    PileNum operands = new PileNum();
    double operand1;
    double operand2;
    double res;

    public double operate(QueueString postfix) {
        while (!postfix.getHead().equals("")) {
            String ch = postfix.remove();
            switch (ch) {
                case "+":
                    operand2 = operands.pop();
                    operand1 = operands.pop();
                    res = operand1 + operand2;
                    operands.push(res);
                    break;
                case "-":
                    operand2 = operands.pop();
                    operand1 = operands.pop();
                    res = operand1 - operand2;
                    operands.push(res);
                    break;
                case "^":
                    operand2 = operands.pop();
                    operand1 = operands.pop();
                    res = Math.pow(operand1, operand2);
                    operands.push(res);
                    break;
                case "*":
                    operand2 = operands.pop();
                    operand1 = operands.pop();
                    res = operand1 * operand2;
                    operands.push(res);
                    break;
                case "/":
                    operand2 = operands.pop();
                    operand1 = operands.pop();
                    res = operand1 / operand2;
                    operands.push(res);
                    break;
                default:
                    operands.push(Double.parseDouble(ch));
            }
        }

        return operands.pop();
    }

}

