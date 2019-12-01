/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpf;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Cpf{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int digB1 = 0;
        int digB2 = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Informe seu CPF: ");
        String cpf;
        cpf = console.nextLine();
        char ncpf[] = new char[9];
        ncpf = cpf.toCharArray();
        for(int i = 0; i < 9; i++){
            digB1 = ((ncpf[i]-'0')*(i+1))+digB1;
            digB2 = ((ncpf[i]-'0')*(9-i))+digB2;
        }
        
        if(digB1%11 == 10)
            digB1 = 0;
        else
            digB1 = digB1%11;
        
        if(digB2%11 == 10)
            digB2 = 0;
        else
            digB2 = digB2%11;
        
        System.out.println("Seu CPF É!!!! " + ncpf[0]+ncpf[1]+ncpf[2]+'.'+ncpf[3]+ncpf[4]+ncpf[5]+'.'+ncpf[6]+ncpf[7]+ncpf[8]+'-'+digB1+digB2);
        
    }
}