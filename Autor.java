import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Autor {
    private int id;

    private String nome;

    private String dataN;

    public String getDataN() {
        return dataN;
    }

    public void setDataN(String dataN) {
        this.dataN = dataN;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAutor(){
        this.setNome(JOptionPane.showInputDialog("Informe o nome do autor:"));
        this.setDataN(JOptionPane.showInputDialog("Informe a data de nascimento do autor:"));
    }

    private List<Autor> autores = new ArrayList<>();
}
