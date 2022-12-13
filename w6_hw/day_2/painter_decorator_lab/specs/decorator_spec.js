const assert = require('assert');
const Decorator = require('../decorator.js');
const Paint = require('../paint.js');
const Room = require('../room.js');

describe('Decorator', function(){
    let decorator;

    beforeEach(function(){
        decorator = new Decorator;   
        paint1 = new Paint(5)
        paint2 = new Paint(4)
        paint3 = new Paint(3)
        paint4 = new Paint(10)
        room1 = new Room(10)

    });

    it('should start with empty paint stock', function(){
        const actual = decorator.stock;
        assert.deepStrictEqual(actual, []);
    });

    it('should be able to add to stock', function(){
        decorator.addPaintStock(1);
        const actual = decorator.stockCount();
        assert.strictEqual(actual, 1)
    })

    it('should be able to calculate total volume of paint in stock', function(){
        decorator.addPaintStock(paint1);
        decorator.addPaintStock(paint2);
        decorator.addPaintStock(paint3);
        const actual = decorator.calculateVolume();
        assert.strictEqual(actual, 12);
    })

    it('should be able to calculate if it has enough paint volume for area of room', function(){
        let vol = paint1.volume;
        let area = room1.area;
        const actual = decorator.enoughPaint(vol, area);
        assert.strictEqual(actual, false);
    })

    it('should be able to calculate if it has enough paint volume for area of room', function(){
        let vol = paint4.volume;
        let area = room1.area;
        const actual = decorator.enoughPaint(vol, area);
        assert.strictEqual(actual, true);
    })

    

});