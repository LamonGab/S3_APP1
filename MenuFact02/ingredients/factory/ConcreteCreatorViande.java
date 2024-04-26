package ingredients.factory;

import ingredients.Epice;
import ingredients.Ingredient;
import ingredients.IntrinsicIngredient;
import ingredients.Viande;
import ingredients.etat.etatIngredient;

/**
 * Classe ConcreteCreatorViande
 */
public class ConcreteCreatorViande implements FactoryCreatorIngredient {
    /**
     * Crée un ingrédient Viande
     * @param nom
     * @param etat
     * @return
     */
    @Override
    public Ingredient create(String nom, etatIngredient etat) {
        return new Viande(nom, etat);
    }

    /**
     * Crée un ingrédient Viande static
     * @param intrinsicIngredient
     * @param nom
     * @return
     */
    public static Ingredient create(IntrinsicIngredient intrinsicIngredient, String nom){
        return new Viande(intrinsicIngredient, nom);
    }
}
