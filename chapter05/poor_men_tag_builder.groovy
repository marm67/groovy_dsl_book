class PoorMenTagBuilder {
	int indent = 0
	Object invokeMethod(String name, Object args) {
		indent.times { print "    " }
		println "<${name}>"
		indent++
		args[0].delegate = this // change delegate to the builder
		args[0].call()
		indent--
		indent.times { print "    " }
		println "</${name}>"
	}
}

def builder = new PoorMenTagBuilder()

builder.root {
	kayaman { 
		baurets { 
			l33t { 
				hax0r { } 
			} 
		} 
	}
}
