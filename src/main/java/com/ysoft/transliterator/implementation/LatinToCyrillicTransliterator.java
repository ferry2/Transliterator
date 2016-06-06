/**
 * 
 */
package com.ysoft.transliterator.implementation;

import javax.validation.constraints.NotNull;

import com.ysoft.transliterator.annotation.AlphabetMapping;
import com.ysoft.transliterator.enumeration.EAlphabet;

/**
 * @author Vladislav Naydenov
 *
 */
@AlphabetMapping(from = EAlphabet.LATIN, to = EAlphabet.CYRILLIC)
public class LatinToCyrillicTransliterator extends AbstractTransliterator {

	@Override
	public void createMappings() {
		createSourceToDestinationMapping();
		createDestinationToSourceMapping();
	}
	
	@Override
	public String transliterate(@NotNull String input) {
		return this.doTransliterate(input, this.sourceToDestinationAlphabetMap);
	}
	
	@Override
	public String transliterateReverse(@NotNull String input) {
		return this.doTransliterate(input, this.destinationToSourceAlphabetMap);
	}
	
	private void createSourceToDestinationMapping() {
		this.sourceToDestinationAlphabetMap.put('a', "�");
		this.sourceToDestinationAlphabetMap.put('b', "�");
		this.sourceToDestinationAlphabetMap.put('c', "�");
		this.sourceToDestinationAlphabetMap.put('d', "�");
		this.sourceToDestinationAlphabetMap.put('e', "�");
		this.sourceToDestinationAlphabetMap.put('f', "�");
		this.sourceToDestinationAlphabetMap.put('g', "�");
		this.sourceToDestinationAlphabetMap.put('h', "�");
		this.sourceToDestinationAlphabetMap.put('i', "�");
		this.sourceToDestinationAlphabetMap.put('j', "j");
		this.sourceToDestinationAlphabetMap.put('k', "�");
		this.sourceToDestinationAlphabetMap.put('l', "�");
		this.sourceToDestinationAlphabetMap.put('m', "�");
		this.sourceToDestinationAlphabetMap.put('n', "�");
		this.sourceToDestinationAlphabetMap.put('o', "�");
		this.sourceToDestinationAlphabetMap.put('p', "�");
		this.sourceToDestinationAlphabetMap.put('q', "q");
		this.sourceToDestinationAlphabetMap.put('r', "�");
		this.sourceToDestinationAlphabetMap.put('s', "�");
		this.sourceToDestinationAlphabetMap.put('t', "�");
		this.sourceToDestinationAlphabetMap.put('u', "�");
		this.sourceToDestinationAlphabetMap.put('v', "�");
		this.sourceToDestinationAlphabetMap.put('w', "�");
		this.sourceToDestinationAlphabetMap.put('x', "�");
		this.sourceToDestinationAlphabetMap.put('y', "�");
		this.sourceToDestinationAlphabetMap.put('z', "�");
	}
	
	private void createDestinationToSourceMapping() {
		this.destinationToSourceAlphabetMap.put('�', "a");
		this.destinationToSourceAlphabetMap.put('�', "b");
		this.destinationToSourceAlphabetMap.put('�', "v");
		this.destinationToSourceAlphabetMap.put('�', "g");
		this.destinationToSourceAlphabetMap.put('�', "d");
		this.destinationToSourceAlphabetMap.put('�', "e");
		this.destinationToSourceAlphabetMap.put('�', "zh");
		this.destinationToSourceAlphabetMap.put('�', "z");
		this.destinationToSourceAlphabetMap.put('�', "i");
		this.destinationToSourceAlphabetMap.put('�', "j");
		this.destinationToSourceAlphabetMap.put('�', "k");
		this.destinationToSourceAlphabetMap.put('�', "l");
		this.destinationToSourceAlphabetMap.put('�', "m");
		this.destinationToSourceAlphabetMap.put('�', "n");
		this.destinationToSourceAlphabetMap.put('�', "o");
		this.destinationToSourceAlphabetMap.put('�', "p");
		this.destinationToSourceAlphabetMap.put('�', "r");
		this.destinationToSourceAlphabetMap.put('�', "s");
		this.destinationToSourceAlphabetMap.put('�', "t");
		this.destinationToSourceAlphabetMap.put('�', "u");
		this.destinationToSourceAlphabetMap.put('�', "f");
		this.destinationToSourceAlphabetMap.put('�', "h");
		this.destinationToSourceAlphabetMap.put('�', "ts");
		this.destinationToSourceAlphabetMap.put('�', "ch");
		this.destinationToSourceAlphabetMap.put('�', "sh");
		this.destinationToSourceAlphabetMap.put('�', "sht");
		this.destinationToSourceAlphabetMap.put('�', "a");
		this.destinationToSourceAlphabetMap.put('�', "y");
		this.destinationToSourceAlphabetMap.put('�', "yu");
		this.destinationToSourceAlphabetMap.put('�', "ya");
	}
}
