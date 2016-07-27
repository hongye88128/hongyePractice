Ext.onReady(function(){
	    //定义列
    var columns = [
        {header:'编号',dataIndex:'id'}, //sortable:true 可设置是否为该列进行排序
        {header:'名称',dataIndex:'name'},
        {header:'描述',dataIndex:'descn'}
      ];
    //定义数据
	var data =[
	        ['1','啊','描述01'],
	        ['2','波','描述02'],
	        ['3','呲','描述03'],
	        ['4','嘚','描述04'],
	        ['5','咯','描述05']
	    ];
    //转换原始数据为EXT可以显示的数据
    var store = new Ext.data.ArrayStore({
        data:data,
        fields:[
           {name:'id'}, //mapping:0 这样的可以指定列显示的位置，0代表第1列，可以随意设置列显示的位置
           {name:'name'},
           {name:'descn'}
        ]
    });
    //加载数据
    store.load();
           
    //创建表格
    var grid = new Ext.grid.GridPanel({
        renderTo:Ext.getBody(), //渲染位置
        store:store, //转换后的数据
        columns:columns, //显示列
        stripeRows:true, //斑马线效果
        //enableColumnMove: false, //禁止拖放列
        //enableColumnResize: false, //禁止改变列宽度
        loadMask:true, //显示遮罩和提示功能,即加载Loading……
        forceFit:true //自动填满表格
    }); 
})