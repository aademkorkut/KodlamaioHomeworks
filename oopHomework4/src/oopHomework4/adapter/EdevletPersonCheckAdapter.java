package oopHomework4.adapter;

import oopHomework4.eDevletPersonCheck.EdevletPersonCheckWS;
import oopHomework4.entities.Gamer;

public class EdevletPersonCheckAdapter implements GamerCheckService {

	@Override
	public boolean checkRealPerson(Gamer gamer) {
		EdevletPersonCheckWS edevletPersonCheck = new EdevletPersonCheckWS();
		return edevletPersonCheck.checkRealPerson(gamer.getNationalIdentity(), gamer.getFirstName(),
				gamer.getLastName(), gamer.getBirthYear());
	}

}
