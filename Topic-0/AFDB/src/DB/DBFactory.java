package DB;

import DB.SQLType;
import DB.MS_SQL;
import DB.MySQL;
import DB.Oracle;

public class DBFactory {
	//will return an url
	public SQLType getSQLType(String type){
		if("ms_sql".equals(type)){
			return new MS_SQL();
		}
		else{
			if("mysql".equals(type)){
				return new MySQL();
			}
			else{
				return new Oracle();
			}
		}
	}
	
}
