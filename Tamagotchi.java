// EDUARDO PROENÇA DAL-PRÁ
public class Tamagotchi{

    // atributos 
    private String nome;
    private int idade;
    private int peso;
    private boolean vivo;
    private int acordado;

    // construtor vazio
    public Tamagotchi(){
    }

    // construtor completo
    public Tamagotchi(String nome, int idade, int peso, boolean vivo){
        this.nome = nome;
        this.idade = 0;
        this.peso = 1;
        this.vivo = true;
    }

    // getters e setters
    // metodo que retorna o NOME do tamagotchi
    public String getNome(){
        return this.nome; // retorna o nome
    }

    public void setNome(String nome){
        this.nome = nome; // pega o nome e o torna o mesmo
    }

    // metodo que retorna o IDADE do tamagotchi
    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    // metodo que retorna o PESO do tamagotchi
    public int getPeso(){
        return this.peso;
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    // metodo que retorna VIVO ou MORTO
    public boolean getVivo(){
        return this.vivo;
    }

    public void setVivo(boolean vivo){
        this.vivo = vivo;
    }

    // metodo que retorna numero de vezes acordado
    public int getAcordado(){
        return this.acordado;
    }

    public void setAcordado(int acordado){
        this.acordado = acordado;
    }

    // metodo print sepultamento
    // impressao do tumulo para quando o pet morrer
    public String sepultamento(){
        String tumulo = "  _______\n" +
            " /       \\\n" +
            "|   RIP   |\n" +
            "|  ★★★  |\n" +
            "|   ___   |\n" +
            "|  |   |  |\n" +
            "|  |___|  |\n" +
            " \\_______/";
        return tumulo; // retorna a string do tumulo
    }

    // metodo opção inválida
    // impressao do fail caso seja uma opção nao disponivel
    public String erro(){ 
        String fail = "▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄"+"\n████▌▄▌▄▐▐▌█████"+"\n████▌▄▌▄▐▐▌▀████"+"\n▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀";
        return fail; // retorna a string do fail 
    }

    // metodo de sentir SONO
    public void dormir() {
        if (this.vivo = true) { // verifica se o pet está vivo
            while (this.acordado <= 5){
                System.out.println("\n======================================================="); // impressao da quebra de linha
                System.out.println("zzz\n      zzz\n             zzz"); // impressao da arte pet
                System.out.println("\n"+this.getNome()+" está com sono!\nO que você deseja fazer? (Idade atual: "+this.getIdade()+" dias.)");
                int escolhaDormir = Teclado.leInt("1.Dormir zzZZZ\n2.Permanecer acordado/a ⚡⚡⚡"); // verifica a opção escolhida

                if(escolhaDormir == 1){ // dormir
                    System.out.println(this.getNome() + " dormiu e ficou descansado/a.\n");
                    this.idade += 1; // aumenta a idade em 1 dia
                    break;

                }else if(escolhaDormir == 2){ // permanecer acordado
                    System.out.println(this.nome + " permaneceu acordado/a e ficou cansado/a.\n"+this.getNome() + " pode ficar acordado/a mais: " + (5 - this.getAcordado() + " vezes."));
                    this.acordado += 1; // aumenta vezes acordado em 1 vez
                    break;

                }else{ // opção inválida
                    System.out.println(this.erro());
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

        }if (this.acordado > 5){
            System.out.println(this.getNome() + " permaneceu acordado/a 5 vezes, agora irá dormir.");
            this.idade += 1; // aumenta a idade em 1 dia
            System.out.println("Idade atual: "+ this.getIdade());

        }
        if (this.idade == 15){ // verifica se a idade chegou a 15 dias
            this.vivo = false; // idade para false = morto
            System.out.println("n"+this.getNome()+" morreu de velhice.");
            System.out.println(this.sepultamento());
        }
    } // fechamento do void dormir

    // metodo de sentir FOME
    public void fome(){
        if(this.vivo = true){ // verifica se o pet está vivo
            while(this.peso < 20){ // verifica se o peso é menor do que 20kg
                System.out.println("\n======================================================="); // impressao da quebra de linha 
                System.out.println("┼┼┼┼┼┼┼┼▓▓▓▓┼┼┼"+"\n┼╔═▒▒▒▒▓▄░░▄▓┼┼"+"\n┼▀┼▒▒▒▓▓▒──▒▓▓┼"+"\n┼┼┼▒▌▒▐┼▓▓▓▓┼┼┼"); // impressao da arte pet
                System.out.println("\n"+this.getNome() + " está com uma fome de leão!\nO que você deseja fazer? (Peso atual: "+this.getPeso()+"Kg)");
                int escolhaFome = Teclado.leInt("1.Comer muito 🍔🍔🍔\n2.Comer pouco 🍔\n3.Não comer"); // escolha das opções

                if (escolhaFome == 1){ // escolha comer muito (1)
                    this.peso = this.getPeso() + 5; // aumenta 5kg
                    this.idade = this.getIdade() + 1; // aumenta 1 dia
                    System.out.println(this.getNome() + " comeu, ficou muito satisfeito/a e tirou um cochilo. Peso atual: " + this.getPeso()+"Kg.");
                    break;

                }else if(escolhaFome == 2){ // escolha comer pouco (2)
                    this.peso = this.getPeso() + 1; // aumenta 1kg
                    System.out.println(this.getNome() + " comeu e ficou satisfeito/a. Peso atual: " + this.getPeso()+"Kg.");
                    break;

                }else if(escolhaFome == 3){ // escolha nao comer (3)
                    this.peso = this.getPeso() - 2; // dimiui 2kg
                    System.out.println(this.getNome() + " não comeu nada e perdeu 2kg! Peso atual: " + this.getPeso()+"Kg.");
                    break;

                }else { // nenhuma das escolha acima
                    System.out.println(this.erro());
                    System.out.println("Por favor, escolha alguma das opções citadas.");
                }
            }
            if (this.peso >= 20){ // verifica se está acima do peso
                this.vivo = false; // peso para false = morto
                System.out.println(this.getNome() + " morreu por estar acima do peso!");
                System.out.println(this.sepultamento()); // impressao do tumulo

            }else if (this.peso <= 0){ // verifica se está abaixo do peso
                this.vivo = false; // peso para false = morto
                System.out.println(this.getNome() + " morreu de desnutrição!");
                System.out.println(this.sepultamento());
            }
        }
    } // fechamento do void FOME

    // metodo de ficar ENTEDIADO
    public void entediado(){
        System.out.println("\n======================================================="); // impressao da quebra de linha 
        System.out.println("──────▄▀▄─────▄▀▄"+"\n─────▄█░░▀▀▀▀▀░░█▄"+"\n─▄▄──█░░░░░░░░░░░█──▄▄"+"\n█▄▄█─█░░▀░░┬░░▀░░█─█▄▄█"); // impressao da arte pet
        System.out.println("\n"+this.getNome()+ " está entediado/a!\nO que você deseja fazer? (Peso atual: "+this.getPeso()+"Kg)");
        int escolhaExe = Teclado.leInt("1.Correr 10 minutos\n2.Caminhar 10 minutos"); // opção de escolha do usuario
        switch (escolhaExe){

            case 1: // escolha do correr (1)
                this.peso = this.getPeso() +1; // adiciona +1 ao peso
                System.out.println(this.getNome()+" emagreceu e logo depois comeu muito. Peso atual: "+this.getPeso()+"Kg.");
                break;
            case 2: // escolha caminhar (2)
                this.peso = this.getPeso() -1; // diminui -1 ao peso
                System.out.println(this.getNome() + " caminhou e está faminto/a!");
                this.fome(); // chama o metodo fome
                break;
            default: // caso nao escolha nada
                System.out.println(this.erro());
                System.out.println("Por favor, escolha alguma das opções citadas.");
                this.entediado(); // chama o metodo entediado
        }
    } // fechamento do void entediado

    @Override // sobrescrita do toString
    public String toString(){
        return "Seu pet de nome "+this.getNome()+", ficou vivo/a por "+this.getIdade()+" dias e teve peso de "+this.getPeso()+"Kg.";
    }
    // NAO EXCLUIR (PUBLIC CLASS)
}