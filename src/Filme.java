public class Filme {
   String nome;
   int anoDeLancamento;
   int duraçaoEmMinutos;
   boolean incluidoNoPlano;
   double somaDasAvaliaçoes;
   double totalDeAvaliaçoes;

   void exibeFichaTecnica(){
      System.out.println("Nome do Filme: " + nome);
      System.out.println("Ano de Lançamento: " + anoDeLancamento);
      System.out.println("Duração em Minutos: " + duraçaoEmMinutos);
      System.out.println("Esta incluso no Plano ? " + incluidoNoPlano);
   }
   void avalia (double nota ){
      somaDasAvaliaçoes += nota;
      totalDeAvaliaçoes ++ ;

   }
   double pegaMedia (){
      return somaDasAvaliaçoes / totalDeAvaliaçoes;
   }
}
