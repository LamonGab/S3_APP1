package ingredients;

import ingredients.etat.etatIngredient;
import ingredients.exceptions.IngredientException;

/**
 * Sous-classe d'Ingredient
 *
 * @author Kevin
 */
public class Viande extends Ingredient{
    /**
     * Constructeur de Viande
     * @param intrinsicIngredient
     * @param name
     */
    public Viande(IntrinsicIngredient intrinsicIngredient, String name) {
        setTypeIngredient(TypeIngredient.VIANDE);
        setNom(name);
        setEtat(intrinsicIngredient.getEtat());
    }

    /**
     * Constructeur de Viande
     * @param name
     * @param etat
     */
    public Viande(String name, etatIngredient etat) {
        setTypeIngredient(TypeIngredient.VIANDE);
        setNom(name);
        setEtat(etat);
    }

    /**
     * Constructeur de Viande
     * @param name
     * @param etat
     * @param desired_quantity
     * @throws IngredientException
     */
    public Viande(String name, etatIngredient etat, double desired_quantity) throws IngredientException {
        setTypeIngredient(TypeIngredient.VIANDE);
        setNom(name);
        setEtat(etat);
        setQuantity(desired_quantity);
    }

    /**
     * Renvoie les informations de l'ingrédient viande
     * @return
     */
    @Override
    public String toString() {
        return "Ingredient{" +
                "Type=" + this.getTypeIngredient() + ", " +
                "Nom=" + this.getNom() + ",  "+
                "Etat=" + this.getEtat() + ", " +
                "Quantite=" + this.getQuantity() +
                '}' + "\n";
    }
}
