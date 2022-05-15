const sqlite3 = require('sqlite3').verbose()
const db = new sqlite3.Database('./db/creative-house.db')
 
db.serialize(function(){

    //Criando a tabela
    db.run(`
        CREATE TABLE IF NOT EXISTS ideas(
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            image TEXT,
            title TEXT,
            category TEXT,
            description TEXT,
            link TEXT,
            createdAt TEXT
        );
    `)


    


    //Consultando dados na tabela
    // db.all(`SELECT* FROM ideas`, function(err, rows){
    //     if (err) return console.log(err)
    //     console.log(rows)
    // })


    //Deletando dados da tabela
    // db.run(`DELETE FROM ideas WHERE id=?`, [1], function(err){
    //     if (err) return console.log(err)
    //     console.log("Deletei", this)
    // })
})

module.exports = db