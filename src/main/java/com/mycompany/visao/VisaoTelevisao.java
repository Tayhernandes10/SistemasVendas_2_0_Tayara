/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.Televisao;
import java.util.Scanner;

/**
 *
 * @author tayara.5970
 */
public class VisaoTelevisao {
    public static Televisao MENUcADASTROTelevisao(){
    
    Televisao televisao = new Televisao();
    
    System.out.println("Nome: ");
    televisao.setNome(new Scanner(System.in).nextLine());
    System.out.println("Preço: ");
    televisao.setPreco(new Scanner(System.in).nextDouble());
    System.out.println("Modelo: ");
    televisao.setModelo(new Scanner(System.in).nextLine());
    
    System.out.println("------------------------------------------");
    return televisao;
    
    }
}
 
    

