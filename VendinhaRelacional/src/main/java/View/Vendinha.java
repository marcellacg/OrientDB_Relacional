package View;
import model.ProdutoBebidas;
import model.ProdutoDeHigiene;
import model.ProdutoDeLimpeza;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Vendinha {
	
	

	public static void main(String[] args) {
	
                EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.events.jpa");
                EntityManager entityManager = entityManagerFactory.createEntityManager();
                
                //INSERT
                ProdutoBebidas pb2 = new ProdutoBebidas(null, "Soda", "Limão", "350ml", "Bubbles", "Refrigerante");
                ProdutoDeHigiene ph1 = new ProdutoDeHigiene(null, "Brilhante", "22,5g", "ToothAndTooth", "Palm-nature", "creme");
                ProdutoDeLimpeza pl1 = new ProdutoDeLimpeza(null, "Sparkles", "2L", "Stunning", "Sabão líquido");
             

		entityManager.getTransaction().begin();
		entityManager.persist(pb2);
		entityManager.getTransaction().commit();
                
                entityManager.getTransaction().begin();
		entityManager.persist(ph1);
		entityManager.getTransaction().commit();
                
                entityManager.getTransaction().begin();
		entityManager.persist(pl1);
		entityManager.getTransaction().commit();
                
		// FIND
//		ProdutoBebidas pb1 = entityManager.find(ProdutoBebidas.class, 1);
//		System.out.println("Nome da bebida: " + pb1.getNomeBebida());
//                System.out.println("Sabor: " + pb1.getSabor());
//                System.out.println("Volume: " + pb1.getVolume());
//                System.out.println("Marca: " + pb1.getMarca());
//                System.out.println("Tipo: " + pb1.getTipo());
//                
//                ProdutoDeHigiene ph2 = entityManager.find(ProdutoDeHigiene.class, 1);
//		System.out.println("Nome do produto: " + ph2.getNomeProdHigiene());
//                System.out.println("Volume: " + ph2.getVolume());
//                System.out.println("Marca: " + ph2.getMarca());
//                System.out.println("Fabricante: " + ph2.getFabricante());
//                System.out.println("Tipo: " + ph2.getTipo());
//                
//                ProdutoDeLimpeza pb3 = entityManager.find(ProdutoDeLimpeza.class, 1);
//		System.out.println("Nome do produto: " + pb3.getNomeProd());
//                System.out.println("Volume: " + pb3.getVolume());
//                System.out.println("Marca: " + pb3.getMarca());
//                System.out.println("Tipo: " + pb3.getTipo());

		
		// DELETE
		
//              ProdutoBebidas pb3 = entityManager.find(ProdutoBebidas.class, 1);
//		entityManager.getTransaction().begin();
//		entityManager.remove(pb3);
//		entityManager.getTransaction().commit();
                
		//UPDATE
                
//		ProdutoBebidas pb4 = new ProdutoBebidas();
//		pb4.setId(1);
//		pb4.setNomeBebida("Fanta Uva");
//              pb4.setSabor("Uva");
//              pb4.setVolume("1L");
//              pb4.setTipo("Refrigerante");
		
//		entityManager.getTransaction().begin();
//		entityManager.merge(pb4);
//		entityManager.getTransaction().commit();

		entityManager.close();
		entityManagerFactory.close();
		
	}
}