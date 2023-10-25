// EDUARDO PROENÇA DAL-PRÁ
import java.util.Random;
public class Principal{
    public static void main(String[] args){

        // criação do tamagotchi (nome)
        Tamagotchi pet = new Tamagotchi();
        pet.setNome(Teclado.leString("Digite o nome de seu Tamagotchi: ")); // nome dado pelo usuário
        pet.setIdade(0); // pré-definido idade em 0 dias
        pet.setPeso(1); // pré-definido peso em 1Kg

        // verficação de teste
        System.out.println("───▄▀▀▀▄▄▄▄▄▄▄▀▀▀▄───"+"\n───█▒▒░░░░░░░░░▒▒█───"+"\n────█░░█░░░░░█░░█────"+"\n─▄▄──█░░░▀█▀░░░█──▄▄─"+"\n█░░█─▀▄░░░░░░░▄▀─█░░█"+"\n█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀█"+"\n█░░╦─╦╔╗╦─╔╗╔╗╔╦╗╔╗░░█"+"\n█░░║║║╠─║─║─║║║║║╠─░░█"+"\n█░░╚╩╝╚╝╚╝╚╝╚╝╩─╩╚╝░░█"+"\n█▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄█"); // impressao do bem vindo
        System.out.println("\nSeu pet tem nome de: "+pet.getNome() + "!\nEle possui idade inical de: "+pet.getIdade() + " dias\nPeso inicial de: "+ pet.getPeso()+"Kg"); // impressoes das caracteristicas iniciais do pet do usuario
        while (true) {
            Random aleatorio = new Random(); // criação de uma variavel aleatoria 
            int eventoRan = aleatorio.nextInt(6+1); // parametros para os eventos
            if(eventoRan == 1 || eventoRan == 2){
                pet.dormir();
            }else if(eventoRan == 3 || eventoRan == 4){
                pet.fome();
            }else{
                pet.entediado();
            }
            if (pet.getPeso() <= 0 || pet.getPeso() >= 20 || pet.getIdade() >= 15 || pet.getIdade() <= 0){
                break;
            }
        }
        System.out.println(pet);
        // fechamento class e main
    }
}