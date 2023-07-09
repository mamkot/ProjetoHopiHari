import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args){
        String[] Nome = new String [10];
        String[] Curso = new String [10];
        int i, MB = 0, B = 0, R = 0;
        double PercMB, PercB, PercR;

        for (i=0; i<10; i++){
            Nome[i] = JOptionPane.showInputDialog("Nome do "+(i+1)+"° aluno: ");
            Curso[i] = JOptionPane.showInputDialog("Curso do "+(i+1)+"° aluno: ");
        }

        for (i=0; i<10; i++){
            int satisfacao = Integer.parseInt(JOptionPane.showInputDialog("Aluno: "+Nome[i]+"\nCurso: "+Curso[i]+"\r\n"+"\nAvalie sua satisfação com o passeio: \n1 - Muito bom \n2 - Bom \n3 - Ruim"));
            if (satisfacao==1){
                MB++;
            }
            else{
                if (satisfacao==2){
                    B++;
                }
                else{
                    R++;
                }
            }
        }

        PercMB=MB*100/10;
        PercB=B*100/10;
        PercR=R*100/10;

        JOptionPane.showMessageDialog(null, "Resultados: "+i+" alunos"+"\nMuito bom: "+MB+" = "+PercMB+"%"
        +"\nBom: "+B+" = "+PercB+"%"
        +"\nRuim: "+R+" = "+PercR+"%");
    }
}