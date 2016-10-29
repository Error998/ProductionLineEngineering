package error998.ple;

public class Reference {
	public static final String MOD_ID = "ple";
	public static final String NAME = "Production Line Engineering";
	public static final String VERSION = "0.0.1";
	public static final String ACCEPTED_VERSION = "[1.10.2]";
	public static final String DOMAIN = MOD_ID;
	
	public static final String CLIENT_PROXY_CLASS = "error998.ple.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "error998.ple.proxy.ServerProxy";
	
	
	// Declare all items here
		public static enum PLE_Items
		{
			PLASTICRAW("plasticRaw", "ItemPlasticRaw"),
			PLASTICBAR("plasticBar", "ItemPlasticBar"),
			RAWCOPPER("copperRaw", "ItemCopperRaw"),
			COPPERBAR("copperBar", "ItemCopperBar"),
			RAWIRON("ironRaw", "ItemIronRaw"),
			IRONBAR("ironBar", "ItemIronBar"),
			RAWRUBBER("rubberRaw", "ItemRubberRaw"),
			RAWSCRAP("scrapRaw", "ItemScrapRaw");
			
			private String unlocalizedName;
			private String registryName;
			
			PLE_Items(String unlocalizedName, String registryName){
				this.unlocalizedName = unlocalizedName;
				this.registryName = registryName;
			}
			
			public String getUnlocalizedName(){
				return unlocalizedName;
			}
			
			public String getRegistryName(){
				return registryName;
			}
		}


		// Declare all blocks here
		public static enum PLE_Blocks {
			FACTORY_FLOOR_BLOCK("factoryfloorblock", "BlockFactoryFloor"),
			FACTORY_WALL_BLOCK("factorywallblock","BlockFactoryWall");
			
			private String unlocalizedName;
			private String registryName;
			
			PLE_Blocks(String unlocalizedName, String registryName){
				this.unlocalizedName = unlocalizedName;
				this.registryName = registryName;
			}
			
			public String getUnlocalizedName(){
				return unlocalizedName;
			}
			
			public String getRegistryName(){
				return registryName;
			}
		}
}
