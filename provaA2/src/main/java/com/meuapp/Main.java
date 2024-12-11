package com.meuapp;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection conn = Conexao.getConnection()) {
            Scanner scanner = new Scanner(System.in);
            UsuarioDAO usuarioDAO = new UsuarioDAO(conn);
            EquipamentoDAO equipamentoDAO = new EquipamentoDAO(conn);

            // Menu de opções
            while (true) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Cadastro de usuário");
                System.out.println("2 - Autenticação");
                System.out.println("3 - Cadastro de equipamento");
                System.out.println("4 - Listar equipamentos por usuário");
                System.out.println("5 - Sair");
                int opcao = scanner.nextInt();
                scanner.nextLine();  // consumir o '\n'

                switch (opcao) {
                    case 1:
                        // Cadastro de usuário
                        System.out.println("Nome:");
                        String nome = scanner.nextLine();
                        System.out.println("Sobrenome:");
                        String sobrenome = scanner.nextLine();
                        System.out.println("Email:");
                        String email = scanner.nextLine();
                        System.out.println("Senha:");
                        String senha = scanner.nextLine();
                        System.out.println("Setor:");
                        String setor = scanner.nextLine();
                        Usuario usuario = new Usuario(0, nome, sobrenome, email, senha, setor);
                        usuarioDAO.cadastrarUsuario(usuario);
                        System.out.println("Usuário cadastrado com sucesso.");
                        break;
                    case 2:
                        // Autenticação
                        System.out.println("Email:");
                        email = scanner.nextLine();
                        System.out.println("Senha:");
                        senha = scanner.nextLine();
                        Usuario usuarioAutenticado = usuarioDAO.autenticar(email, senha);
                        if (usuarioAutenticado != null) {
                            System.out.println("Usuário autenticado: " + usuarioAutenticado.getNome());
                        } else {
                            System.out.println("Credenciais inválidas.");
                        }
                        break;
                    case 3:
                        // Cadastro de equipamento
                        System.out.println("Nome do equipamento:");
                        String nomeEquipamento = scanner.nextLine();
                        System.out.println("Modelo:");
                        String modelo = scanner.nextLine();
                        System.out.println("Idade em meses:");
                        int idadeMes = scanner.nextInt();
                        scanner.nextLine();  // consumir o '\n'
                        System.out.println("ID do usuário:");
                        int usuarioId = scanner.nextInt();
                        scanner.nextLine();  // consumir o '\n'
                        Equipamento equipamento = new Equipamento(0, nomeEquipamento, modelo, idadeMes, usuarioId);
                        equipamentoDAO.cadastrarEquipamento(equipamento);
                        System.out.println("Equipamento cadastrado com sucesso.");
                        break;
                    case 4:
                        // Listar equipamentos por usuário
                        System.out.println("ID do usuário:");
                        int usuarioIdEquipamento = scanner.nextInt();
                        scanner.nextLine();  // consumir o '\n'
                        List<Equipamento> equipamentos = equipamentoDAO.listarEquipamentosPorUsuario(usuarioIdEquipamento);
                        for (Equipamento equip : equipamentos) {
                            System.out.println("Equipamento: " + equip.getNome() + " - " + equip.getModelo());
                        }
                        break;
                    case 5:
                        System.out.println("Saindo...");
                        return;
                    default:
                        System.out.println("Opção inválida.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
