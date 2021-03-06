package init;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class StartServer {
	
	public void generator() throws Exception{
		
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("config/genarator.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		
	}
	
	public static void main(String[] args) throws Exception {
		
		try {
			
			StartServer startServer = new StartServer();
			startServer.generator();
			System.out.println("操作完成");
			
		} catch (Exception e) {
			System.out.println("抛出异常");
			e.printStackTrace();
		}
	}

}
