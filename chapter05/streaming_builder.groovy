def xml = new groovy.xml.StreamingMarkupBuilder()

def markup = {
	mkp.xmlDeclaration()
	customers {
		customer(id:1001) {
			name(firstname:"Fred", lastname:"Flintstone")
			address(street:"1 Rock Road", city:"Bedrock")
			
		}
		customer(id:1001) {
			name(firstname:"Barney", lastname:"Rubble")
			address(street:"2 Rock Road", city:"Bedrock")
		}
	}
}

println xml.bind(markup)