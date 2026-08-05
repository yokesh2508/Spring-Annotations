A Spring Core project demonstrating Interface-based Dependency Injection using Java Annotations.
This project uses `@Component`, `@Autowired`, `@Qualifier`, `@Configuration`, and `@ComponentScan` 
to inject multiple implementations (`SBI` and `CUB`) of the `Bank` interface into the `ATM` class 
through the Spring IoC Container. 
It provides a simple example of resolving bean ambiguity with `@Qualifier` and Java-based configuration.
