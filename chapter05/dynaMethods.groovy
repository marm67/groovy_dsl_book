// buggy :((


class Customer {
	def name
	def adress
}

def c = new Customer()

c.properties.keyset().findAll { !(it =~ /lass/) }.each {
	Customer.metaClass."print_${it}" = { -> println delegate."${it}"}
}

def customer1 = new Customer(name:"Kayaman", address:"nil road") 

c.print_name
c.print_address