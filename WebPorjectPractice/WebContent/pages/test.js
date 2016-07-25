

var fn = function() {
	alert('user name==>' + this.name);
}

var user = {
	name : "张三同学"
}

Ext.onReady(fn, user);