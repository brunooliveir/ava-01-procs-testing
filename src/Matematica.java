class Matematica{

    static int potencia(int base, int expoente){
      int expozero = 0; /* variável que retornará o valor da potência, iniciada em 0 por default */
      if (expoente >= 0) /* para casos onde o expoente não é negativo, expozero vale 1 (o nome faz referencia a expoente zero)*/
        expozero = 1;

      for(int i = 1; expoente > i; i++){ /* caso o valor do expoente for 1 ou inferior, o valor de expozero não será alterado pelo for */
        if (i == 1) /* caso seja a primeira iteracao */
          expozero = base * base;
        if (i != 1) /* caso ouver mais de uma iteracao */
          expozero = expozero * base;
      }

      return expozero;
    }

}
