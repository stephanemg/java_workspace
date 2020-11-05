module userdaomodule {
	exports org.userdaomodule;
	requires entitymodule;
	requires daomodule;
	//provides daomodule.Dao with userdaomodule.UserDao;
}