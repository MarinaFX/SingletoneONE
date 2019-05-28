## 4. Singleton


### 4.1.Exercício:


Escreva, compile e execute o programa abaixo. Em seguida, troque sua implementação para que a classe
Incremental seja Singleton. Execute novamente e veja os resultados.

```
class Incremental {
	private static int count = 0;
	private int numero;


	public Incremental() {
		numero = ++count;
	}


	public String toString() {
		return "Incremental " + numero;
	}


}
```

```
public class TesteIncremental {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		Incremental inc = new Incremental();
		System.out.println(inc);
		}
	}
}
```
