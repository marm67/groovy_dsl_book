Calendar.metaClass.static.getInstance = { new GregorianCalendar() }

println Calendar.getInstance().getTime()

Calendar.metaClass.static.now = { Calendar.getInstance().getTime() }

println Calendar.now()