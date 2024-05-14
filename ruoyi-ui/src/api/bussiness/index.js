import request from '@/utils/request'

// 查询评价指标列表
export function listIndex(query) {
  return request({
    url: '/bussiness/index/list',
    method: 'get',
    params: query
  })
}

// 查询评价指标详细
export function getIndex(id) {
  return request({
    url: '/bussiness/index/' + id,
    method: 'get'
  })
}

// 新增评价指标
export function addIndex(data) {
  return request({
    url: '/bussiness/index',
    method: 'post',
    data: data
  })
}

// 修改评价指标
export function updateIndex(data) {
  return request({
    url: '/bussiness/index',
    method: 'put',
    data: data
  })
}

// 删除评价指标
export function delIndex(id) {
  return request({
    url: '/bussiness/index/' + id,
    method: 'delete'
  })
}
