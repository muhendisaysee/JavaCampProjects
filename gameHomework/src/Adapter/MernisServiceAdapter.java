package Adapter;

import Abstract.IPlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService{

	@Override
	public Boolean CheckIfReelPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	try {
			
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getName().toUpperCase(), player.getSurname().toUpperCase(), player.getBirth().getYear());
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
}
