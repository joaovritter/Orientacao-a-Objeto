package TrabalhoFinal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    private FileWriter arqw;
    private BufferedWriter escritor;
    private FileReader arqr;
    private BufferedReader leitor;
    private List<Produto> listaProdutos;
    public String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listaProdutos = new ArrayList<>();
    }

    public void gravarArquivo(Produto p) {
        try {
            arqw = new FileWriter(nomeArquivo + ".txt", true);
            escritor = new BufferedWriter(arqw);
            // Formato: Código,Descrição,PreçoCusto,PreçoVenda,Estoque
            escritor.write(p.getCodigo() + "," + p.getDescricao() + "," + p.getPrecoCusto() + ","
                    + p.getPrecoVenda() + "," + p.getEstoque());
            escritor.newLine();
            escritor.close();
            arqw.close();

            System.out.println("Produto salvo no arquivo!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Produto> lerArquivo() {
        System.out.println("Produtos lidos do arquivo:");
        try {
            arqr = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqr);
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");

                int codigo = Integer.parseInt(campos[0]);
                String descricao = campos[1];
                double precoCusto = Double.parseDouble(campos[2]);
                double precoVenda = Double.parseDouble(campos[3]);
                int estoque = Integer.parseInt(campos[4]);

                Produto produto = new Produto(codigo, descricao, precoCusto, precoVenda, estoque);
                listaProdutos.add(produto);
            }
            leitor.close();
            arqr.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaProdutos;
    }

    public void atualizarArquivo(List<Produto> produtos) {
        try {
            arqw = new FileWriter(nomeArquivo + ".txt");
            escritor = new BufferedWriter(arqw);

            for (Produto p : produtos) {
                escritor.write(p.getCodigo() + "," + p.getDescricao() + "," + p.getPrecoCusto() + ","
                        + p.getPrecoVenda() + "," + p.getEstoque());
                escritor.newLine();
            }

            escritor.close();
            arqw.close();

            System.out.println("Arquivo atualizado com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
