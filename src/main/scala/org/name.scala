package org {
  object Name {
    def main(args: Array[String]) {
      if( args != null &&  args.length > 0) {

        var message:String = ""

        for ( message<- args ) {
          encode(message)
        }

      }
    }
    
    def encode( message:String ) : String = {
      println( "---------------------------------------------------" )
      
      var encoded:String = Base64.encodeBytes(message.getBytes())
      println("Encoded: " + encoded)
      
      var decodedBytes:Array[Byte] = Base64.decode(encoded)
      var decoded:String = new String(decodedBytes)
      println("Decoded: " + decoded)
      
      println( "---------------------------------------------------" )
      return encoded
    }
  }
}