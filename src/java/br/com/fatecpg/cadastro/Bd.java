
package br.com.fatecpg.cadastro;

import java.util.ArrayList;


public class Bd {
    
    private static ArrayList<Clientes> clientes = new ArrayList<> ();

    public static ArrayList<Clientes> getClientes() {
        return clientes;
    } 

private static ArrayList<Fornecedores> fornecedores = new ArrayList<> ();

    public static ArrayList<Fornecedores> getFornecedores() {
        return fornecedores;
    }
    
}

    
