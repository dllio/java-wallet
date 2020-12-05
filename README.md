# blockchain-java

{
    "code": 200,
    "message": "New account created, please remember your Address and Private Key.",
    "item": {
        "address": "0xd7dd662e41c66ae31e493ca719a1d1e04a8174fe",
        "balance": 0,
        "privateKey": "aaaf41772d195fd61a236871a0e100589efaceee9f33c12491cb37e99b9a165d"
    }
}
```

``` 
{
    "code": 200,
    "message": "Create a new block",
    "item": {
        "header": {
            "index": 8,
            "difficulty": 2.8269553036454149273332760011886696253239742350009903329945699220681916416e+73,
            "nonce": 9302,
            "timestamp": 1531739951847,
            "hash": "0002d041d584afb3609bfeb58a1eb25bef5540154f6b672522ce6e455c08c75b",
            "previousHash": "000c3738e3819bb52fc254e185eaae00dd39086a8bc2837cb4faf06d6edc51d6"
        },
        "body": {
            "transactions": [
                {
                    "from": null,
                    "sign": null,
                    "to": "0x69dc11cae775647d495b2c8930a17b31827b286b",
                    "publicKey": null,
                    "amount": 50,
                    "timestamp": 1531739951847,
                    "txHash": "0x472f84eb7488d4b72a5dc4c6b40b496dfa2b281c655fd2d4d1fefbd047b7fbda",
                    "status": "SUCCESS",
                    "errorMessage": null,
                    "data": "Miner Reward."
                }
            ]
        }
    }
}
```

{
	"from":"0x69dc11cae775647d495b2c8930a17b31827b286b",
	"to":"0x9f44d5aa11ba82b6e2cfe47ef529f8eabc6ebda5",
	"amount":5.5,
	"privateKey":"69c4caa1495e678208f1ee60f578a63ce5d0a6780541877454545a722175d760",
	"data":"hello world"
}
````

{
    "code": 200,
    "message": "SUCCESS",
    "item": {
        "from": "0x69dc11cae775647d495b2c8930a17b31827b286b",
        "sign": "3045022100AE0606BACCDAFCBA8B84ED27B58B5F0239F243DEAFF46617E56864A6D8A677E702204DE4EBAC8213225D68D6395FD54602FCF24CD71D96E82F21DBEF77CADC43F70F",
        "to": "0x9f44d5aa11ba82b6e2cfe47ef529f8eabc6ebda5",
        "publicKey": "PZ8Tyr4Nx8MHsRAGMpZmZ6TWY63dXWSCz7FbyM3mvg3favYhhHXarHN6hXgYwKtvLAfXM5YgLDnZx1YPoo4G9pdiR5RQrhtBYriMCh5mGC3RC93HLFkBnAgi",
        "amount": 5.5,
        "timestamp": 1531739924777,
        "txHash": "0x74e5e59d69604b4081c81dae66f429febea9abb77ed6cd7f5b33e6da8ae667f9",
        "status": "APPENDING",
        "errorMessage": null,
        "data": "hello world"
    }
}
```


{
    "code": 200,
    "message": "SUCCESS",
    "item": [
        {
            "address": "0x230ee512f454c4cb90e54b730d52a73e726b6db1",
            "balance": 0
        },
        {
            "address": "0x69dc11cae775647d495b2c8930a17b31827b286b",
            "balance": 269
        },
        {
            "address": "0x800c9be60dcec723525432338944dc6a7a8a9bc4",
            "balance": 0
        },
        {
            "address": "0x9f44d5aa11ba82b6e2cfe47ef529f8eabc6ebda5",
            "balance": 5.5
        },
        {
            "address": "0xd7dd662e41c66ae31e493ca719a1d1e04a8174fe",
            "balance": 0
        }
    ]
}
```

 
{
    "code": 200,
    "message": "SUCCESS",
    "item": {
        "header": {
            "index": 9,
            "difficulty": 2.8269553036454149273332760011886696253239742350009903329945699220681916416e+73,
            "nonce": 18508,
            "timestamp": 1531740497326,
            "hash": "00059e0981bcd08ed4fbaf8973a738a2111ab5887c54e4b685579658cb4bb38c",
            "previousHash": "0002d041d584afb3609bfeb58a1eb25bef5540154f6b672522ce6e455c08c75b"
        },
        "body": {
            "transactions": [
                {
                    "from": null,
                    "sign": null,
                    "to": "0x69dc11cae775647d495b2c8930a17b31827b286b",
                    "publicKey": null,
                    "amount": 50,
                    "timestamp": 1531740497326,
                    "txHash": "0xd48edd85006ae5331fb934b0236944eb5f87761a3784582cd3dd03b793d17e5a",
                    "status": "SUCCESS",
                    "errorMessage": null,
                    "data": "Miner Reward."
                },
                {
                    "from": "0x69dc11cae775647d495b2c8930a17b31827b286b",
                    "sign": "30450220644FC1CAA4342AB7AFBEF200DA80E6870BBB9C5D3638CCE14635713B4E88BA80022100CA60B42FBDD6767E9605E005296499D682525D429BF0ACEECB450B826510534E",
                    "to": "0x9f44d5aa11ba82b6e2cfe47ef529f8eabc6ebda5",
                    "publicKey": "PZ8Tyr4Nx8MHsRAGMpZmZ6TWY63dXWSCz7FbyM3mvg3favYhhHXarHN6hXgYwKtvLAfXM5YgLDnZx1YPoo4G9pdiR5RQrhtBYriMCh5mGC3RC93HLFkBnAgi",
                    "amount": 5.5,
                    "timestamp": 1531740497291,
                    "txHash": "0x2a06176017345522882bbf6a6e5c4247ecdfc49fc705edab6e820f88af89add6",
                    "status": "APPENDING",
                    "errorMessage": null,
                    "data": "hello world"
                }
            ]
        }
    }
}
