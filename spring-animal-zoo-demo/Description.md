A Spring Core project demonstrating Interface-based Dependency Injection using Java Annotations.
This project uses `@Component`, `@Autowired`, `@Qualifier`, `@Configuration`, and `@ComponentScan` 
to inject multiple implementations (`Lion` and `Monkey`) of the `Animal` interface into the `Zoo` 
class through the Spring IoC Container. 
It provides a simple example of resolving bean ambiguity with `@Qualifier` and Java-based configuration.
