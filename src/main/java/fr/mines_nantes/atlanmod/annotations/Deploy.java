package fr.mines_nantes.atlanmod.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)

public @interface Deploy {
	// master / slave
	public String type();
	// 0=node0, -1=all nodes less 0, -2=all nodes
	public int monitor();
}