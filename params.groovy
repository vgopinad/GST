node{
  stage("preload the parameters") {
        
    deleteDir()
    checkout scm   
    config= readYaml file: "config/app.yml"    
    def name=params.name1
    print "value from jennkin ${name}"   
    
    urlValue=config.URl.create_org
    
    print "urlValue: ${urlValue}"
        
        }
  
  
}
