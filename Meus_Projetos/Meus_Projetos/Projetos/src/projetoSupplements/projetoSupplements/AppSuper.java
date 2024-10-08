package projetoSupplements;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



interface Categoria{
   String getProduto();
   double getPreco();
   int getQuantidade();
   int getItem();
}
abstract  class Itens implements Categoria{

    private  int item;
    private String produto;
    private double preco;
    private  int quantidade;
   
   
   
    public  Itens( int item, String produto, double preco ,int quantidade)
    {
        this.item= item; 
        this.produto = produto;
        this.preco= preco; 
        this.quantidade= quantidade;
        

    }
    public String getProduto() {
        return produto;
    }
    public double getPreco() {
        return preco;
    } public int getQuantidade() {
        return quantidade ;
    }
    public int getItem() {
      return item ;
  }
}

 class HIPERCALÓRICO extends Itens
{
   public HIPERCALÓRICO( int item,String produto, double preco ,int quantidade){
      super(item,produto, preco , quantidade );
     }
}

class Vitaminas  extends Itens
{
   public Vitaminas( int item,String produto, double preco ,int quantidade){
      super(item,produto, preco , quantidade );
     }
}
class Termogenicos  extends Itens
{
   public Termogenicos( int item,String produto, double preco ,int quantidade){
      super(item,produto, preco , quantidade );
     }
   }

class Pretreinos extends Itens
{
   public Pretreinos( int item,String produto, double preco ,int quantidade){
      super(item,produto, preco , quantidade );
     }
}

public class AppSuper {


   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha =0  ;
        double somaPreco= 0;
        int somaQuantedade=0;
         Proteina pProteina = new Proteina();
         pProteina.arrayProteina();
         Aminoacidos aminoacidosInstance = new Aminoacidos(0, "", 0.0, 0);
        
         // Obtenha a lista de aminoácidos
         List<Itens> listaAminoacidos = aminoacidosInstance.Amino();

         for (Itens aminoacidosget : listaAminoacidos) {
            System.out.println("Item: " + aminoacidosget.getItem());
            System.out.println("Produto: " + aminoacidosget.getProduto());
            System.out.println("Preço: R$ " + aminoacidosget.getPreco());
            System.out.println("Quantidade:" + aminoacidosget.getQuantidade());
            
   
        }
         List<Itens> hiper = new ArrayList<>();
         // Produtos Growth
         hiper.add(new HIPERCALÓRICO(0,"-GROWTH SUPPLEMENTS-HIPER MASS (1KG) SABOR CHOCOLATE - " ,36.00 , 1));
         hiper.add(new HIPERCALÓRICO(1,"-GROWTH SUPPLEMENTS-(TOP) HIPERCALÓRICO (SABOR CHOCOLATE) (1KG) -" ,49.50 , 1));
         hiper.add(new HIPERCALÓRICO(2,"-GROWTH SUPPLEMENTS-BIG MASS PRO HIPERCALÓRICO 3KG -" ,144.00 , 1));
         // Produtos Max titanium
         hiper.add(new HIPERCALÓRICO(3,"- Max Titanium-Mass Titanium Refil 3Kg -" ,117.56 , 1));
         hiper.add(new HIPERCALÓRICO(4,"- Max Titanium-Super Gainers Refil 3Kg-" ,125.13 , 1));
         hiper.add(new HIPERCALÓRICO(5,"- Max Titanium-Mass Titanium 17500 ZERO LACTOSE 2,4kg-" ,110.00 , 1));
         hiper.add(new HIPERCALÓRICO(6,"- Max Titanium-Super Whey 900G-" ,75.85 , 1));
         hiper.add(new HIPERCALÓRICO(7,"- Max Titanium-Mass Titanium Refil 1,4Kg-" ,64.50 , 1));
            // Produtos Integralmedica
         hiper.add(new HIPERCALÓRICO(8,"-  Integralmedica -Creamass Hipercalorico com Creatina 3Kg-",110.52,1));
         hiper.add(new HIPERCALÓRICO(9,"-  Integralmedica -Nutri Whey Protein Pote 900g-",82.94,1));
         hiper.add(new HIPERCALÓRICO(10,"-  Integralmedica -Nutri Whey Protein  900g-",75.04,1));
         hiper.add(new HIPERCALÓRICO(11,"-  Integralmedica -Nutri Whey Protein  1,8Kg-",134.22,1));
 
         List<Itens> vitaminas = new ArrayList<>();
         //Produtos  Growth Supplements
         vitaminas.add(new Vitaminas(0,"- Growth Supplements-Multivitamínico (120 cáps) (nova fórmula)- ",36.90,1));
         vitaminas.add(new Vitaminas(1,"- Growth Supplements-Óleo de Peixe Ultra (75 softgel) - ",42.30,1));
         vitaminas.add(new Vitaminas(2,"- Growth Supplements-Vitamina D ULTRA (2000UI) 120 caps  - ",27.00,1));
         vitaminas.add(new Vitaminas(3,"- Growth Supplements-Vitamina B12 com 120 cápsulas -",19.80,1));
         vitaminas.add(new Vitaminas(4,"- Growth Supplements-Cloreto de Magnésio 120 comp -",18.00,1));
         vitaminas.add(new Vitaminas(5,"- Growth Supplements-Coenzima Q10 -",31.50,1));
         vitaminas.add(new Vitaminas(6,"- Growth Supplements- Vitamina C (120 caps)-",14.40,1));
         vitaminas.add(new Vitaminas(7,"- Growth Supplements-ZMA (120 caps)-",22.68,1));
         vitaminas.add(new Vitaminas(8,"- Growth Supplements-Vitamina C + Zinco Efervescente Tubete c/ 10 Tabs -",7.20,1));
         vitaminas.add(new Vitaminas(8,"- Growth Supplements-Polivitamínico Mastigável 120Comp -",23.40,1));
         vitaminas.add(new Vitaminas(9,"- Growth Supplements-Vitamina K2 60 Cápsulas -",19.80,1));
         vitaminas.add(new Vitaminas(10,"- Growth Supplements-NAC (N-ACETIL L-CISTEÍNA) 60CAPS-",36.00,1));
         vitaminas.add(new Vitaminas(11,"- Growth Supplements-Growth Skin 345g (Colágeno tipo 1 + Colágeno VERISOL&reg; + Ácido Hialurônico + Vitamina C) -",88.20,1));
         vitaminas.add(new Vitaminas(12,"- Growth Supplements-Vitamina D (75 cápsulas)-",13.50,1));
         vitaminas.add(new Vitaminas(13,"- Growth Supplements-Óleo de Cártamo + Coco + Chia + Cromo + Vit. E (75 caps) -",27.00,1));
         vitaminas.add(new Vitaminas(14,"- Growth Supplements-Cálcio + Vitamina D + Vitamina K - 120 comp -",63.00,1));
         vitaminas.add(new Vitaminas(15,"- Growth Supplements-Picolinato de Cromo 120caps-",18.00,1));
         vitaminas.add(new Vitaminas(16,"- Growth Supplements-HAIR SKIN GUMMY 30UN-",36.00,1));
         vitaminas.add(new Vitaminas(17,"- Growth Supplements-Vitamina E (75caps)-",13.50,1));
          // Produtos Max titanium  
         vitaminas.add(new Vitaminas(18,"- Max Titanium-Omega 3 90 Caps-",56.85,1));
         vitaminas.add(new Vitaminas(19,"- Max Titanium-Multimax Complex 90 Caps-",56.85,1));
         vitaminas.add(new Vitaminas(20,"- Max Titanium- Vitamina D3 60 Caps",60.62,1));
         vitaminas.add(new Vitaminas(21,"- Max Titanium- Vitamina C 500Mg-",48.40,1));
         vitaminas.add(new Vitaminas(22,"- Max Titanium- CA - Óleo de Cártamo 120 Caps-",63.85,1));
         // Produtos Integralmedica 
         vitaminas.add(new Vitaminas(23,"- Integralmedica-ZMA Testo Booster-",39.92,1));
         vitaminas.add(new Vitaminas(24,"- Integralmedica- VitaPure Super-",72.12,1));
         vitaminas.add(new Vitaminas(25,"- Integralmedica- 4 Sleep Night Time Recovery-",53.32,1));
         vitaminas.add(new Vitaminas(26,"- Integralmedica- Reforz- C Immunity-",90.12,1));
       
         List<Itens> termogenicos = new ArrayList<>();
         // Produtos Growth 
         termogenicos.add(new Termogenicos(0,"- Growth Supplements-HOT Termogênico (60 Comprimidos) -",37.80,1));
         termogenicos.add(new Termogenicos(1,"- Growth Supplements-Óleo de Cártamo + Coco + Chia + Cromo + Vit. E (75 caps) -",27.00,1));
         termogenicos.add(new Termogenicos(2,"- Growth Supplements-L-Carnitina Líquida 2000 - 420ml -",42.30,1));
         termogenicos.add(new Termogenicos(3,"- Growth Supplements-Gengibre em po 250gr -",21.60,1));
         // Produtos Max titanium 
         termogenicos.add(new Termogenicos(4,"- Max Titanium-Shot Dry 150g -",98.56,1));
         termogenicos.add(new Termogenicos(5,"- Max Titanium-2Hot 200G -",87.18 ,1));
         termogenicos.add(new Termogenicos(6,"- Max Titanium-Fire Black 60 Caps-",34.87 ,1));
         termogenicos.add(new Termogenicos(7,"- Max Titanium-Shot Thermo Max 60 Cáps-",69.84 ,1));
         termogenicos.add(new Termogenicos(8,"- Max Titanium-L Carnitina 60 Caps-",90.94 ,1));
         termogenicos.add(new Termogenicos(9,"- Max Titanium-Fire White 60 Caps-",29.88 ,1));
         termogenicos.add(new Termogenicos(10,"- Max Titanium-L-Carnitine Pure 400Ml-",83.39 ,1));
         // Produto Integrelmedica
         termogenicos.add(new Termogenicos(11,"- Integralmedica-Therma Pro Hardcore-",47.92 ,1));
         termogenicos.add(new Termogenicos(12,"- Integralmedica-Lipo Dry-",107.91 ,1));
         termogenicos.add(new Termogenicos(13,"- Integralmedica-H2OUT - DIURETIC-",78.21 ,1));
          
         List<Itens> pretreino = new ArrayList<>();
         // Porduto Growth
         pretreino.add(new Pretreinos(0,"- Growth Supplements-Pré-Treino Haze Hardcore 300g  -", 103.50, 1));
         pretreino.add(new Pretreinos(1,"- Growth Supplements-Pré-treino Insanity 300g  -", 108.00, 1));
         // Produtos Max titanium 
         pretreino.add(new Pretreinos(2,"- Max Titanium-Égide 300g  -", 151.71, 1));
         pretreino.add(new Pretreinos(3,"- Max Titanium-Horus 150g  -", 89.90, 1));
        // Produtp Integralmedica 
         pretreino.add(new Pretreinos(4,"- Integralmedica-Huger Pré-Treino 320g -", 111.93, 1));
         pretreino.add(new Pretreinos(5,"- Integralmedica-Beta Alanina em Pó 123g -", 70.31, 1));

      }

   


    
}
