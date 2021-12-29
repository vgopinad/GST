node{
  stage("preload the parameters") {
        
    deleteDir()
    
    def name=params.name1
    
    print "value from jennkin ${name}"
   
        
        }
  
  
}
