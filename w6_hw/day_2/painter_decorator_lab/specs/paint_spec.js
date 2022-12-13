const assert = require('assert');
const Paint = require('../paint.js')

describe ('Paint', function(){
    let paint;


    beforeEach(function(){
        paint = new Paint(5)
    });

    it('should have a volume of paint', function(){
        const actual = paint.volume;
        assert.strictEqual(actual, 5)
    });

    it('should be able to check if empty', function(){
        const actual = paint.checkVolume()
        assert.strictEqual(actual, true)
    })

    it('should be able to empty itself', function(){
        const actual = paint.empty();
        assert.strict(actual, 0);
    })
});