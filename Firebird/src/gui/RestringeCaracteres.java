package gui;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class RestringeCaracteres extends PlainDocument {  
      
        final String permitidos;  
        final int tamanho;  
      
        public RestringeCaracteres(String permitidos, int tam) {  
            this.permitidos = permitidos;  
            tamanho = tam;  
        }  
      
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {  
      
            //Aqui eh feito o 'filtro', retirando os caracteres nao permitidos.  
            //Esta logica pode ser substituída, para criar qualquer tipo de filtro  
            if (tamanho <= 0) {        // aceitara qualquer no. de caracteres  
      
                StringBuffer sb = constroiPermitidos(str);  
                super.insertString(offset, sb.toString(), attr);  
                return;  
            }  
      
            int ilen = (getLength() + str.length());  
            if (ilen <= tamanho) // se o comprimento final for menor...  
            {  
                StringBuffer sb = constroiPermitidos(str);  
                super.insertString(offset, sb.toString(), attr);   // ...aceita str  
      
            } else {  
                if (getLength() == tamanho) {  
                    return; // nada a fazer  
      
                }  
                StringBuffer sb = constroiPermitidos(str);  
                String newStr = sb.toString().substring(0, (tamanho - getLength()));  
      
                super.insertString(offset, newStr, attr);  
            }  
      
        }  
      
        private StringBuffer constroiPermitidos(String str) {  
            StringBuffer sb = new StringBuffer(str);  
            for (int i = sb.length() - 1; i >= 0; i--) {  
                if (permitidos.indexOf(sb.charAt(i)) < 0) {  
                    sb.replace(i, i + 1, "");  
                }  
            }  
            return sb;  
        }  
      
//        public static void main(String[] args) {  
//            JFrame f = new JFrame();  
//            f.getContentPane().add(  
//                    new JTextField(new RestringeCaracteres("2134567890abcdefABCDEF",10), "", 20));  
//            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
//            f.pack();  
//            f.setVisible(true);  
//        }  
    }  