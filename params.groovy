node{
  stage("preload the parameters") {
        
    deleteDir()
    
    def name=params.name1
    print "value from jennkin ${name}"
   
    config= readYaml file= "config/app.yml"
    
    def urlValue=config.url.create_org
    
    print "urlValue: ${urlValue} "
        
        }
  
  
}
