//define a Class named Persion
Ext.define('Person',{
	name: '张三',
	age: '20',
	say: function(){
		Ext.Msg.alert('Title','Hello ' + this.name);
	},
	//constructor for this Class
	constructor: function (name,age){
		this.name = name;
		this.age = age;
	}
})

//继承Person类
Ext.define('SuperMan',{
	extends: 'Person',
	say: function(){
		Ext.Msg.alert('title',this.name + 'says I am a SuperMan');
	}
})

Ext.onReady(function(){
	//create a Class instance and invoke its method
	var person01 = new Person();
	
	var person02 = new Person('李四','24');
	//person01.say();
	person02.say(); 
	
	var superman = new SuperMan('蜘蛛侠',20);
	//superman.say();
})