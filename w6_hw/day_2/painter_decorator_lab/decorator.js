const Room = require("./room");


const Decorator = function(){
    this.stock = []
};

Decorator.prototype.addPaintStock = function(paintCan){
    this.stock.push(paintCan);
};

Decorator.prototype.stockCount = function(){
    return this.stock.length;
};

Decorator.prototype.calculateVolume = function(){
    volumeTotal = 0;
    for (let paint of this.stock ) {
        volumeTotal += paint.volume
    }
    return volumeTotal;    
};

Decorator.prototype.enoughPaint = function(volume, area){
    return volume >= area;

    // if (volume < area) {
    //     return false;
    // } else {
    //     return true;
    // } 
}

module.exports = Decorator;