module mainappmodule {
	requires entitymodule;
	requires userdaomodule;
	requires daomodule;
	uses org.daomodule.Dao;
	uses org.entitymodule.User;
	exports org.mainappmodule;
}