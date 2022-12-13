const Paint = function(volume){
    this.volume = volume
};

Paint.prototype.checkVolume = function() {
    if (this.volume > 0){
        return true;
    } 
};

Paint.prototype.empty = function() {
    (this.volume === 0);
    return this.volume;
}

module.exports = Paint;

