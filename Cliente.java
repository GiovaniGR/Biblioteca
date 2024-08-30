import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private int id;
    private String nome;
    private Date dataN;
    private String email;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataN() {
        return dataN;
    }
    public void setDataN(Date dataN) {
        this.dataN = dataN;
    }

    public void cadastroC(){
        this.setNome(JOptionPane.showInputDialog("Informe o nome do cliente:"));
        this.setEmail(JOptionPane.showInputDialog("Informe o e-mail do cliente:"));
        SimpleDateFormat formatoBR = new SimpleDateFormat("dd/MM/yyyy");

        try{
            String dataNasc = JOptionPane.showInputDialog("Informe a data de nascimento do cliente (Use o formato dd/MM/yyyy):");
            this.setDataN(formatoBR.parse(dataNasc));
        }catch(ParseException e){
            JOptionPane.showMessageDialog(null, "Data inserida inválida! Por favor, insira no formato indicado.");
        }

    }
}
