public class Principal {
    public static void main(String[] args) {
        Filme meufilme = new Filme();
        meufilme.nome = "Vingadores: Guerra Infinita";
        meufilme.anoDeLancamento = 2018;
        meufilme.duraçaoEmMinutos = 149;
        meufilme.incluidoNoPlano = true;

        meufilme.exibeFichaTecnica();
        meufilme.avalia(7);
        meufilme.avalia(5.5);
        meufilme.avalia(8);
        System.out.println(meufilme.somaDasAvaliaçoes);
        System.out.println(meufilme.totalDeAvaliaçoes);
        System.out.println(meufilme.pegaMedia());


    }

    }

