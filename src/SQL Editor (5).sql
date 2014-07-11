Select 
case 
	when c.costcenter_id = 3 then '63'
	when c.costcenter_id = 8 then '94'
	when c.costcenter_id = 12 then '65'
end as ciudad,
a.cpartyaccount_id as contrato,
a.citem_id as idproducto, 
case when b.name='e-Mail' then a.rootcitem_id else nvl(a.reqcitem_id,0) end as idprodpadre, 
b.name as tipo, a.state,
d.address
	From tamcontracteditemd a, tpcproducts b, tamcpartyaccountd c, tamapnames d
	Where citem_id Is Not Null 
		and a.citem_id = d.accesscitem_id
		and d.aptypename_id = 51
		And b.id=a.product_id
		And a.state in('A')
		And a.cpartyaccount_id = c.account_id	
		And Sysdate Between a.contractedfrom And nvl(contractedto,Sysdate)
		and c.costcenter_id in (12) 
		And b.name in ('Modem', 'e-Mail', 'DialUp')
		and exists (select 1 from ytCredMaxTemp x where x.cpartyaccount_id=a.cpartyaccount_id)
		--and a.cpartyaccount_id = 14833813;
		
		order by c.accounttype_id;
		-- And c.accounttype_id in (4,5,7,8,11)
		
		/* And b.name not In ('DialUp', 'e-Mail','Modem','eMTA','eMTA Line','Conference Call',
				   'Call Waiting','Call Transfer','Virtual Line','Caller ID',
				   'Do Not Disturb','INVERSION DE PORALIDAD'); */
		
	
	
Select * From tamcontracteditemd;
Select * From tamcpartyaccountd;
Select * From tamcpartyaccounttypes;
select distinct(name) From tpcproducts;

193.1.1.102
select count(*) from tspactionqueue s
where state = 'Q'
and s.requesteddate >= trunc(sysdate)
and s.spsystem_id = 4



	

