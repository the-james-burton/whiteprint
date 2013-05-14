package com.googlecode.whiteprint.example.zebra;

import java.util.List;

import org.drools.KnowledgeBase;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.junit.Test;

/**
 * https://engage.redhat.com/forms/rule-design-patterns
 * 
 * 1. There are five houses.
 * 2. The Englishman lives in the red house.
 * 3. The Spaniard owns the dog.
 * 4. Coffee is drunk in the green house.
 * 5. The Ukrainian drinks tea.
 * 6. The green house is immediately to the right of the ivory house.
 * 7. The Old Gold smoker owns snails.
 * 8. Kools are smoked in the yellow house.
 * 9. Milk is drunk in the middle house.
 * 10. The Norwegian lives in the first house.
 * 11. The man who smokes Chesterfields lives in the house next to the man with the fox.
 * 12. Kools are smoked in a house next to the house where the horse is kept.
 * 13. The Lucky Strike smoker drinks orange juice.
 * 14. The Japanese smokes Parliaments.
 * 15. The Norwegian lives next to the blue house.
 *
 * Who drinks water? Who owns the zebra?
 * 
 * @author burtojf
 *
 */
public class ZebraPuzzle {

    @Test
    public void testZebra() {

	KnowledgeBuilder kBuilder = KnowledgeBuilderFactory
		.newKnowledgeBuilder();
	KnowledgeBase kBase = kBuilder.newKnowledgeBase();
	kBuilder.add(
		ResourceFactory.newClassPathResource("zebra.drl", getClass()),
		ResourceType.DRL);
	if (kBuilder.hasErrors()) {
	    System.err.println(kBuilder.getErrors().toString());
	}

	StatefulKnowledgeSession kSession = kBase.newStatefulKnowledgeSession();
	kBase.addKnowledgePackages(kBuilder.getKnowledgePackages());

	for (List<Animal> list : EnumUtil.permute(Animal.class)) {
	    kSession.insert(new Animals(list));
	}
	for (List<Colour> list : EnumUtil.permute(Colour.class)) {
	    kSession.insert(new Colours(list));
	}
	for (List<Drink> list : EnumUtil.permute(Drink.class)) {
	    kSession.insert(new Drinks(list));
	}
	for (List<Nationality> list : EnumUtil.permute(Nationality.class)) {
	    kSession.insert(new Nationalities(list));
	}
	for (List<Smoke> list : EnumUtil.permute(Smoke.class)) {
	    kSession.insert(new Smokes(list));
	}

	kSession.fireAllRules();
    }
}