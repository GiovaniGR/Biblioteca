import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Livro {
    private int id;
    private boolean status = true;
    private String titulo;
    private String dataC;
    private String dataA;

    Autor a =  new Autor();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataC() {
        return dataC;
    }

    public void setDataC(String dataC) {
        this.dataC = dataC;
    }

    public String getDataA() {
        return dataA;
    }

    public void setDataA(String dataA) {
        this.dataA = dataA;
    }

    public void addLivro(){
        this.setTitulo(JOptionPane.showInputDialog("Informe o título do livro:"));
        this.setDataC(JOptionPane.showInputDialog("Informe a data do cadastro:"));
        this.setDataA(JOptionPane.showInputDialog("Informe a data de atualização do livro:"));
    }

    private List<Livro> livros = new ArrayList<>();
}
